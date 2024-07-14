package lesson17;

public enum InputCategory {
    NUMBER("number"),
    TEXT("text"),
    SPECIAL_CARACTER("special caracter");

   String value;

    InputCategory(String value) {
        this.value = value;
    }
}
