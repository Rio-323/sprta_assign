package org.sparta.sparta_asssign.controller;


import org.sparta.sparta_asssign.dto.ItemRequestDto;
import org.sparta.sparta_asssign.dto.ItemResponseDto;
import org.sparta.sparta_asssign.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/post")
    public ItemResponseDto createBoard(@RequestBody ItemRequestDto itemRequestDto) {

        return itemService.createBoard(itemRequestDto);
    }

    @GetMapping("/post")
    public List<ItemResponseDto> getBoard() {
        return itemService.getBoards();
    }

    @PutMapping("/post/{id}")
    public Long updateBoard(@PathVariable Long id, @RequestBody ItemRequestDto itemRequestDto) {

        return itemService.updateBoard(id, itemRequestDto);
    }

    @DeleteMapping("/post/{id}")
    public Long deleteBoard(@PathVariable Long id) {
        return itemService.deleteBoard(id);
    }
}
