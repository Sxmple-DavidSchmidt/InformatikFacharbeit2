package gui.components;

import world.Camera;

import javax.swing.*;
import java.awt.*;

public class CameraController extends JPanel {
    private final Vec3Controller positionController;
    private final Vec3Controller orientationController;

    public CameraController() {
        positionController = new Vec3Controller();
        orientationController = new Vec3Controller();

        setLayout(new BorderLayout());
        add(new JLabel("Camera Controller"), BorderLayout.NORTH);

        JPanel wrapperPanel = new JPanel();
        wrapperPanel.setLayout(new GridLayout(2, 0));
        wrapperPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        wrapperPanel.add(positionController);
        wrapperPanel.add(orientationController);
        add(wrapperPanel, BorderLayout.CENTER);
    }

    public void setCamera(Camera camera) {
        positionController.setVec3(camera.getPosition());
        orientationController.setVec3(camera.getOrientation());
    }
}
