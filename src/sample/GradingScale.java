package sample;

public class GradingScale {
        private static final GradingScale gradingScale = new GradingScale();
        public static GradingScale instance(){return gradingScale;}

        public LetterGrade toLetter(double percent){
            if(percent >= 17/18.0){
                return LetterGrade.A;
            }
            else if(percent == .94){
                return LetterGrade.A;
            }
            else if(percent >= 8/9.0){
                return LetterGrade.Am;
            }
            else if(percent >= 5/6.0){
                return LetterGrade.Bp;
            }
            else if(percent >= 7/9.0){
                return LetterGrade.B;
            }
            else if(percent >= 13/18.0){
                return LetterGrade.Bm;
            }
            else if(percent == .72){
                return LetterGrade.Bm;
            }
            else if(percent >= 2/3.0){
                return LetterGrade.Cp;
            }
            else if(percent >= 3/5.0){
                return LetterGrade.C;
            }
            else if(percent >= 8/15.0){
                return LetterGrade.Cm;
            }
            else if(percent == .53){
                return LetterGrade.Cm;
            }
            else if(percent >= 7/15.0){
                return LetterGrade.Dp;
            }
            else if(percent >= 2/5.0){
                return LetterGrade.D;
            }
            else if(percent > 1/3.0) {
                return LetterGrade.Dm;
            }

            else if(percent == .33){
                return LetterGrade.Dm;
                }
            else {
                return LetterGrade.F;
            }
        }
}
