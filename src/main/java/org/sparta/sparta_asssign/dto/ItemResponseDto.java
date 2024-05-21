package org.sparta.sparta_asssign.dto;

import lombok.Getter;
import org.sparta.sparta_asssign.entity.Item;

@Getter
public class ItemResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String username;
    private int price;

    public ItemResponseDto(Item item) {
        this.id = item.getId();
        this.title = item.getTitle();
        this.contents = item.getContents();
        this.username = item.getUsername();
        this.price = item.getPrice();
    }
}
