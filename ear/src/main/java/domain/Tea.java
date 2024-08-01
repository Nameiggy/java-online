package domain;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
public class Tea {
    private final String color;
    private final String author;
}
