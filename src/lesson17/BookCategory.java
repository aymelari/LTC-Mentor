package lesson17;

public enum BookCategory {
    FICTION(" Imaginary storytelling"),
    NON_FICTION("  Factual writing"),
    SCIENCE(" Scientific knowledge"),
    HISTORY(" Past events"),
    FANTASY("  Magical worlds");

    String description;

    BookCategory(String description) {
        this.description = description;
    }
}
