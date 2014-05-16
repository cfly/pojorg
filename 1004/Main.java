import java.util.Scanner;

public class Main {
public static void main(String args[]){
double[] v = new double[276];
calcV(v, 275);
double f = 5.19;
Scanner scanner = new Scanner(System.in);
String a= scanner.next();
while (!"0.00".equals(a)) {
f=Double.valueOf(a);
System.out.println(locate(v, f) + " card(s)");
a = scanner.next();
}
}
static double calcV(double[] v, int i) {
return i != -1 ? v[i] = (double) 1 / (i + 2) + calcV(v, i - 1) : 0;
}
static int locate(double[] v, double f) {
if (f <= 0.5) {
return 1;
}
int s = v.length >> 1, l = s;
while (!(f > v[l] && f <= v[l + 1])) {
s >>= 1;
if (f <= v[l]) {
l -= s + 1;
} else {
l += s + 1;
}}
return l + 2;
}}
