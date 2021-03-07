fun main(args: Array<String>) {

    val a = 234.345
    val b = 45.698

    System.out.printf("%.6f - %.6f\n", a, b)
    System.out.printf("%.0f - %.0f\n", a, b)
    System.out.printf("%.1f - %.1f\n", a, b)
    System.out.printf("234.34 - %.2f\n", b)
    System.out.printf("%.3f - %.3f\n", a, b)
    System.out.printf("%e - %e\n", a, b)
    System.out.printf("%E - %E\n", a, b)
    System.out.printf("%.6g - %.5g\n", a, b)
    System.out.printf("%.6G - %.5G\n", a, b)

}
