package Logic;
import Model.Monom;
import Model.Polynomial;
import javax.swing.*;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    public static Polynomial addPolynomial(Polynomial p1, Polynomial p2){
        Polynomial p3 = new Polynomial();
        p3.setList(p1.getList());
        for (Map.Entry<Integer, Double> set2 : p2.getList().entrySet()) {
            if(p1.getList().containsKey(set2.getKey())) {
                if(p1.getList().get(set2.getKey()) + set2.getValue() == 0){
                    p3.getList().remove(set2.getKey());
                }
                else{
                    p3.addMonom(new Monom(set2.getKey(), p1.getList().get(set2.getKey()) + set2.getValue()));
                }
            } else {
                p3.addMonom(new Monom(set2.getKey(), set2.getValue()));
            }
        }
        return p3;
    }
    public static Polynomial subtractPolynomial(Polynomial p1, Polynomial p2){
        Polynomial p3 = new Polynomial();
        p3.setList(p1.getList());
        for (Map.Entry<Integer, Double> set2 : p2.getList().entrySet()) {
            if(p1.getList().containsKey(set2.getKey())) {
                if(p1.getList().get(set2.getKey()) - set2.getValue() == 0){
                    p3.getList().remove(set2.getKey());
                }
                else{
                    p3.addMonom(new Monom(set2.getKey(), p1.getList().get(set2.getKey()) - set2.getValue()));
                }
            } else {
                p3.addMonom(new Monom(set2.getKey(), -set2.getValue()));
            }
        }
        return p3;
    }
    public static Polynomial multiplyPolynomial(Polynomial p1, Polynomial p2){
        Polynomial p3 = new Polynomial();
        for (Map.Entry<Integer, Double> set1 : p1.getList().entrySet()) {
            for (Map.Entry<Integer, Double> set2 : p2.getList().entrySet()) {
                if (p3.getList().containsKey(set1.getKey() + set2.getKey())) {
                    if (p3.getList().get(set1.getKey() + set2.getKey()) + set1.getValue() * set2.getValue() == 0 && set1.getKey() + set2.getKey() != 0) {
                        p3.getList().remove(set1.getKey() + set2.getKey());
                    } else {
                        p3.addMonom(new Monom(set1.getKey() + set2.getKey(), p3.getList().get(set1.getKey() + set2.getKey()) + set1.getValue() * set2.getValue()));
                    }
                } else if (!p3.getList().containsKey(set1.getKey() + set2.getKey()) && set1.getValue() * set2.getValue() != 0) {
                    p3.addMonom(new Monom(set1.getKey() + set2.getKey(), set1.getValue() * set2.getValue()));
                }

            }
        }
        return p3;
    }
    public static Polynomial differentiatePolynomial(Polynomial p1){
        Polynomial p3 = new Polynomial();
        for (Map.Entry<Integer, Double> set1 : p1.getList().entrySet()) {
            if(set1.getKey() == 0){
                continue;
            }
            p3.addMonom(new Monom(set1.getKey() - 1, set1.getValue()*set1.getKey()));
        }
        return p3;
    }
    public static Polynomial integralPolynomial(Polynomial p1){
        Polynomial p3 = new Polynomial();
        for (Map.Entry<Integer, Double> set1 : p1.getList().entrySet()) {
            p3.addMonom(new Monom(set1.getKey() + 1, set1.getValue()/(set1.getKey() + 1)));
        }
        return p3;
    }

    public static void inputCheck(String s, String title, JPanel panel){
        if(s.equals("no input")) {
            JOptionPane.showMessageDialog(panel, s, title, JOptionPane.ERROR_MESSAGE);
            return;
        }
        String regex = "^([+-]?\\d+(\\.\\d+)?x\\^\\d+)*$";
        if(s.matches(regex)){
            return;
        }
        JOptionPane.showMessageDialog(panel, s, title, JOptionPane.ERROR_MESSAGE);
    }

    public static Polynomial getPolynomial(String s){
        Polynomial result = new Polynomial();
        Pattern pattern = Pattern.compile("([-+]?\\d*\\.?\\d*)?x\\^(\\d+)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String coefficient = matcher.group(1);
            if (coefficient == null || coefficient.equals("+")) {
                coefficient = "1";
            } else if (coefficient.equals("-")) {
                coefficient = "-1";
            }
            result.addMonom(new Monom(Integer.parseInt(matcher.group(2)), Double.parseDouble(coefficient)));
        }
        return result;
    }

    // ![0-9]x^[0-9][-+]
}
