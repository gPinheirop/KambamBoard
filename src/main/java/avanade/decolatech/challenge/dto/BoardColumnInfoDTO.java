package avanade.decolatech.challenge.dto;

import avanade.decolatech.challenge.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
