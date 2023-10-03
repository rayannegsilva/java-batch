package com.rayannegilo.backend;

import java.math.BigDecimal;

public record TransactionCnab (
    Integer tipo,
    String data,
    BigDecimal valor,
    Long cpf,
    String cartao,
    String hora,
    String donoDaLoja,
    String nomeDaLoja
) { }
