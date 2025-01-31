public class SwitchUnderstanding {
    public static void main(String[] args) {

        int switchValue = 1;
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3 -> System.out.println("Value is 3");
            default -> System.out.println("Default Value");
        }
    }

//    {
//        public static void switchun()
////        {
////           String month = "May";
////            return switch (month) {
////                case "Jan", "Feb", "Mar" -> {
////                    yield "1st";
////                }
////                case "Apr", "May", "June " -> " 2 ";
////                case "july", "aug", "sept" -> "3";
////                case "nov", "dec", "jan" -> "4";
////                default -> {
////                    String badResponse = month + " is bad";
////                    yield badResponse;
////                }
////
////            };
////        }
    }


