package com.crafaelcmiranda.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
@Enty
public class Pedido {
    private Integer id;
    private BigDecimal total;
    private LocalDate dataPedido;

    private Cliente cliente;
    private List<ItemPedido> itens;

}
