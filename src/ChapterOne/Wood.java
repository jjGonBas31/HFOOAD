package ChapterOne;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString() {
        switch(this){
            case INDIAN_ROSEWOOD: return "indian rosewood";
            case BRAZILIAN_ROSEWOOD: return "brazilin rosewood";
            case MAHOGANY: return "mahogany";
            case MAPLE: return "maple";
            case COCOBOLO: return "cocobolo";
            case CEDAR: return "cedar";
            case ADIRONDACK: return "adirondack";
            case SITKA: return "sitka";
            default: return "";
        }
    }

}
