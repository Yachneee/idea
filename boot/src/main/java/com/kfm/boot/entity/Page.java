package com.kfm.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> implements Serializable {
    /**
     * 当前页码
     */
    private int pageNum;

    private int pageSize;
    /**
     * 当前表的总数
     */
    private long total;
    /**
     * 上一页的页码
     */
    private int prevNum;
    /**
     * 页数
     */
    private int pageCount;
    /**
     * 下一页的页码
     */
    private int nextNum;
    /**
     * 是否存在上一页
     */
    private boolean hasPrev;
    /**
     * 是否存在下一页
     */
    private boolean hasNext;
    /**
     * 所有的页码信息
     */
    private int[] pageNumbers;
    private List<T> data;
    public Page(int pageNum, int pageSize, long total, List<T> data) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.data = data;
    }
    public int getPrevNum() {
        return this.pageNum - 1;
    }
    public int getNextNum() {
        return this.pageNum + 1;
    }
    public int getPageCount() {
        return (int) (Math.ceil((double) this.total / this.pageSize));
    }
    public boolean getHasPrev() {
        // 如果是第一页就没有前一页
        return this.pageNum != 1;
    }
    public boolean getHasNext() {
        return this.pageNum != this.getPageCount();
    }
    public int[] getPageNumbers() {
        // 10 1,2,3,4,5,6,7,8,9,10  5 当前页 前两个 后两个 1,2 3 4,5，6
        int start = 1;
        int end = getPageCount();
        if (getPageCount() > 5) {
            // 1 -1  3   456 7 8
            start = pageNum - 2;
            end = pageNum + 2;
            if (start <= 0) {
                start = 1;
                end = 5;
            }
            if (end > getPageCount()) {
                end = getPageCount();
                start = end - 4;
            }
        }
        int[] numbers = new int[end - start + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start + i;
        }
        return numbers;
    }
}
