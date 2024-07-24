package com.pentagon.nacos.service.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author gandalf
 * @since 2024-07-23
 */
@ApiModel(value = "Company对象", description = "")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("股票符号")
    private String symbol;

    private String stockCode;

    private String stockName;

    private String companyName;

    @ApiModelProperty("市值")
    private Double marketValue;

    @ApiModelProperty("流通市值")
    private Double floatMarketValue;

    @ApiModelProperty("实际流通市值")
    private Double activeMarketValue;

    @ApiModelProperty("上个交易日股价")
    private BigDecimal lastPrice;

    @ApiModelProperty("总股本")
    private Double stockTotal;

    @ApiModelProperty("流通股本")
    private Double floatStockTotal;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    public Double getFloatMarketValue() {
        return floatMarketValue;
    }

    public void setFloatMarketValue(Double floatMarketValue) {
        this.floatMarketValue = floatMarketValue;
    }

    public Double getActiveMarketValue() {
        return activeMarketValue;
    }

    public void setActiveMarketValue(Double activeMarketValue) {
        this.activeMarketValue = activeMarketValue;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Double getStockTotal() {
        return stockTotal;
    }

    public void setStockTotal(Double stockTotal) {
        this.stockTotal = stockTotal;
    }

    public Double getFloatStockTotal() {
        return floatStockTotal;
    }

    public void setFloatStockTotal(Double floatStockTotal) {
        this.floatStockTotal = floatStockTotal;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(LocalDateTime gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    @Override
    public String toString() {
        return "Company{" +
        "id = " + id +
        ", symbol = " + symbol +
        ", stockCode = " + stockCode +
        ", stockName = " + stockName +
        ", companyName = " + companyName +
        ", marketValue = " + marketValue +
        ", floatMarketValue = " + floatMarketValue +
        ", activeMarketValue = " + activeMarketValue +
        ", lastPrice = " + lastPrice +
        ", stockTotal = " + stockTotal +
        ", floatStockTotal = " + floatStockTotal +
        ", gmtCreate = " + gmtCreate +
        ", gmtUpdate = " + gmtUpdate +
        "}";
    }
}
