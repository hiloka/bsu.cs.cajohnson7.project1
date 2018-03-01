package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.awt.*;

public class Controller {


    public javafx.scene.control.TextField cPointsText;
    public TextField tPointsText;
    public TextField pEarnedText;
    public TextField pPossibleText;
    public TextField currentPercentText;
    public TextField currentLetterGradeText;
    public TextField newGradeText;
    public TextField newPercentText;
    public VBox possibleGradeVBox;
    public VBox currentGradeVBox;


    @FXML
    private void gradeCalc() throws  NumberFormatException{
        double percent;
        double newPercent;
        double cPoints = Integer.parseInt(cPointsText.getText());
        double tPoints = Integer.parseInt((tPointsText.getText()));
        double pEarned = Integer.parseInt(pEarnedText.getText());
        double pPossible = Integer.parseInt(pPossibleText.getText());

        percent = (cPoints/tPoints);
        newPercent = ((cPoints+pEarned)/(tPoints+pPossible));

        currentPercentText.setText(String.valueOf(percent));
        newPercentText.setText(String.valueOf(newPercent));
        LetterGrade grade =GradingScale.instance().toLetter(percent);
        String gradeString = Formatter.instance().format(grade);
        currentLetterGradeText.setText(gradeString);
        LetterGrade newGrade=GradingScale.instance().toLetter(newPercent);
        String newGradeString = Formatter.instance().format(newGrade);
        newGradeText.setText(newGradeString);


    }
}
