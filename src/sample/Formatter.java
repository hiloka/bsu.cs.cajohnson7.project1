package sample;

public class Formatter {
        private static final Formatter letterGrade = new Formatter();

        public static Formatter instance()  { return letterGrade;}

        public String format(LetterGrade grade) {
            switch(grade) {
                case A: return "A";
                case Am: return "A-";
                case Bp: return "B+";
                case B: return "B";
                case Bm: return "B-";
                case Cp: return "C+";
                case C: return "C";
                case Cm: return "C-";
                case Dp: return "D+";
                case D: return "D";
                case Dm: return "D-";
                case F: return "F";
                default: throw new IllegalArgumentException("Score Malfuntion");

            }
        }
}
