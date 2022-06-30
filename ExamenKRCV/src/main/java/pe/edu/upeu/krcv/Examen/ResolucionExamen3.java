package pe.edu.upeu.krcv.Examen;

public  void Examen03() {
int nut;
    System.out.print("ingrese la altura de la X:");
    nut = leer.nextInt();
    for (int i = 1; i <= nut; i++) {
    for (int j = 1; j <= nut; j++) {
    if (i == j || i + j == nut + 1)
    System.out.print("*");
    else
    System.out.print(" ");
}
    System.out.println();
}
}
