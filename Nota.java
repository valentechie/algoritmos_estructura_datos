// Original (orden descendente: mayor a menor)

byGrade.sort((a, b) -> {
    int cmp = Double.compare(b.getAverage(), a.getAverage());
    if (cmp != 0) return cmp;
    return a.compareTo(b);
});


// Cambiar a orden ascendente (menor a mayor):

byGrade.sort((a, b) -> {
    int cmp = Double.compare(a.getAverage(), b.getAverage()); // <- este cambio
    if (cmp != 0) return cmp;
    return a.compareTo(b);
});
