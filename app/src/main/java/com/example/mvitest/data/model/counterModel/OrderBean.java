package com.example.mvitest.data.model.counterModel;

import java.util.List;

/**
 * @ClassName OrderBean
 * @Description 和获取订单接口实体类
 * @Author YS
 * @Date 2023/9/11 9:40
 */
public class OrderBean {
    @Override
    public String toString() {
        return "OrderBean{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }

    private Integer status;
    private List<DataBean> data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {

        private String billid;
        private String billcode;
        private String billdate;
        private String remark;
        private int scan_status;

        public int getScan_status() {
            return scan_status;
        }

        public void setScan_status(int scan_status) {
            this.scan_status = scan_status;
        }

        public String getBillid() {
            return billid;
        }

        public void setBillid(String billid) {
            this.billid = billid;
        }

        public String getBillcode() {
            return billcode;
        }

        public void setBillcode(String billcode) {
            this.billcode = billcode;
        }

        public String getBilldate() {
            return billdate;
        }

        public void setBilldate(String billdate) {
            this.billdate = billdate;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "billid='" + billid + '\'' +
                    ", billcode='" + billcode + '\'' +
                    ", billdate='" + billdate + '\'' +
                    ", remark='" + remark + '\'' +
                    ", scan_status=" + scan_status +
                    '}';
        }
    }
}
