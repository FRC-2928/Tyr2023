package frc.robot.sensors;

import com.ctre.phoenix.sensors.PigeonIMU;

/**
 * Utility class responsible for the gyro
 */
public class Pigeon{
    private static PigeonIMU m_pigeon;

    public Pigeon(){
        m_pigeon = new PigeonIMU(0);
        
    }

    public double getYaw(){
        double ypr[] = {0, 0, 0};
        m_pigeon.getYawPitchRoll(ypr);
        return ypr[0];
    }
    public double getRoll(){
        double r[] = {0, 0, 0};
        m_pigeon.getYawPitchRoll(r);
        return r[2];
    }
    public double getPitch(){
        double r[] = {0, 0, 0};
        m_pigeon.getYawPitchRoll(r);
        return r[1];
    }

    public void resetGyro(){
        m_pigeon.setYaw(0);
    }
}
