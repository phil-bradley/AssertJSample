/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.philb.sampleui.test;

import ie.philb.sampleui.MainFrame;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.edt.GuiQuery;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author philb
 */
public class NewEmptyJUnitTest {

    private FrameFixture window;

    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }

    @Before
    public void setup() {
        System.out.println("Creating frame");
        MainFrame frame = GuiActionRunner.execute(new GuiQuery<MainFrame>() {

            @Override
            protected MainFrame executeInEDT() throws Throwable {
                return new MainFrame();
            }

        });

        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
    }

    @After
    public void tearDown() {
        if (window != null) {
            window.cleanUp();
        }

    }

    @Test
    public void shouldShowStatusNone() {
        window.label("lblStatus").requireText("None");
    }

    @Test
    public void showShowStatusClearedOnReset() {
        window.button("btnReset").click();
        window.label("lblStatus").requireText("Cleared");
    }
}
