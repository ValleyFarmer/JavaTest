package JavaTest;

import lombok.Getter;

public enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");

    @Getter
    private String shortcut;

    Size(String shortcut) {
        this.shortcut = shortcut;
    }
}
