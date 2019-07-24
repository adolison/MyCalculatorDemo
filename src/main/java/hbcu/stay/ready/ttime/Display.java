package hbcu.stay.ready.ttime;

public class Display {

        private double currentNumber = 0;

        public void setCurrentNumber(double n) {
            currentNumber = n;
        }
        public double getCurrentNumber() {
            return currentNumber;
        }

        public void clear(){
            currentNumber = 0.0;
        }


        private String[]  displayModeList = {"binary","octal","decimal","hexadecimal"};
        private String displayMode = "binary";
        int displayModeIndex = 0;
        public String switchDisplayMode (){
            displayModeIndex++;
            if (displayModeIndex == 4){
                displayModeIndex = 0;
            }
            return displayModeList[displayModeIndex];
        }

        private String[] displayUnitList = {"Degrees", "Radians"};
        private String displayUnit = "Degrees";
        int displayUnitIndex = 0;
        public String switchDisplayUnit(){
            displayUnitIndex++;
            if(displayUnitIndex == 4){
                displayUnitIndex = 0;
            }
            return displayUnitList[displayUnitIndex];
        }

}
