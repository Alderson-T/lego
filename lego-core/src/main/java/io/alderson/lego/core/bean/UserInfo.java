package io.alderson.lego.core.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {

    private String userKey;

    private Long id;
}
