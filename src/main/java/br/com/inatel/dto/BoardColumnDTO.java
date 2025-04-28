package br.com.inatel.dto;

import br.com.inatel.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {
}
