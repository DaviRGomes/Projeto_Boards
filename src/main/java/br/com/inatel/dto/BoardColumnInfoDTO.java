package br.com.inatel.dto;

import br.com.inatel.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
