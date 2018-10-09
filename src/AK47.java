public class AK47 {
    static int bullet;
    static boolean single;

    AK47() {
        bullet = 30;
        single = true;
    }

    private static void trigger() {
        if (single) {
            singleShot();
        } else {
            burstShot();
        }
    }

    public void switchSinngleMode() {
        single = true;
    }

    public void switchBurstMode() {
        single = false;
    }

    public static void newClip () {
        bullet = 30;
    }

    public static void singleShot() {
        if (bullet == 0) {
          newClip();
        }
        System.out.println("Бах");
        bullet--;
    }

    public static void burstShot() {
        if (bullet == 0) {
            newClip();
        }
        if (bullet > 4) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Бах");
                bullet--;
            }
        }
        else {
            for (int i = 0; i < bullet; i++) {
                System.out.println("Бах");
            }
            bullet = 0;
        }
    }


    public static void main (String[] arg) {
        trigger();
    }
}
