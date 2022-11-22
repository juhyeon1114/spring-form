package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryCode {
    private String code;
    private String displayName;

    public DeliveryCode(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
}
