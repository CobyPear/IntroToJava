package LabSwitch;

class SwitchStatement {

    public static void main(String[] args) {
        int x = 10;

        switch (x) {
            case 10:
                System.out.println("Case 10 ran");
                break;
            case 5:
                System.out.println("Case 5 ran");
                break;
            default:
                System.out.println("Default case ran");
                break;
        }
    }

}