package org.sparta.sparta_asssign.service;

import jakarta.transaction.Transactional;
import org.sparta.sparta_asssign.dto.ItemRequestDto;
import org.sparta.sparta_asssign.dto.ItemResponseDto;
import org.sparta.sparta_asssign.entity.Item;
import org.sparta.sparta_asssign.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemResponseDto createBoard(ItemRequestDto requestDto) {
        Item item = new Item(requestDto);

        Item savedItem = itemRepository.save(item);

        ItemResponseDto itemResponseDto = new ItemResponseDto(item);

        return itemResponseDto;
    }

    public List<ItemResponseDto> getBoards() {
        return itemRepository.findAll().stream().map(ItemResponseDto::new).toList();
    }

    @Transactional
    public Long updateBoard(Long id, ItemRequestDto requestDto) {

        Item item = findBoard(id);

        item.update(requestDto);

        return id;
    }

    public Long deleteBoard(Long id) {
        Item item = findBoard(id);

        itemRepository.delete(item);

        return id;
    }

    private Item findBoard(Long id) {

        Item item = itemRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("선택한 메모는 존재하지 않습니다.")
        );

        return item;
    }
}
