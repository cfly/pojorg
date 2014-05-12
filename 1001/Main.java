import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
public static void main(String args[]) throws Exception {
Scanner scanner = new Scanner(System.in);
DecimalFormat nf = new DecimalFormat();
nf.setMinimumIntegerDigits(0);
nf.setMaximumIntegerDigits(1000);
nf.setMinimumFractionDigits(0);
nf.setMaximumFractionDigits(1000);nf.setGroupingUsed(false);
while (scanner.hasNext()) {
String r = scanner.next();
int n = scanner.nextInt();
System.out.println(nf.format(new BigDecimal(r).pow(n,MathContext.UNLIMITED)));
}}}
