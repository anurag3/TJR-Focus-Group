package anuragdesai.library.kneereplacement;

/**
 * Created by Joshua on 12/1/2015.
 */
public enum Joint {
    BACK, RIGHT_HIP, LEFT_HIP, RIGHT_KNEE, LEFT_KNEE, SEND;

    public static Joint getJointFromButtonNumber(int number){
        switch(number){
            case 1:
                return BACK;
            case 2:
                return RIGHT_HIP;
            case 3:
                return LEFT_HIP;
            case 4:
                return RIGHT_KNEE;
            case 5:
                return LEFT_KNEE;
            default:
            case -1:
                return SEND;
        }
    }
}
