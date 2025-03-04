package info.bitrich.xchangestream.okex.dto;

import lombok.*;
import org.knowm.xchange.okex.dto.OkexInstType;

import java.util.List;

@Data
@AllArgsConstructor
public class OkexSubscribeMessage {
    private final String op;
    private final List<SubscriptionTopic> args;

    @Data
    public static class SubscriptionTopic {
        private final String channel;

        private final OkexInstType instType;

        private final String uly;

        private final String instId;

        private String ccy;

        public SubscriptionTopic(String channel, OkexInstType instType, String uly, String instId) {
            this.channel = channel;
            this.instType = instType;
            this.uly = uly;
            this.instId = instId;
        }

        public SubscriptionTopic(String channel, OkexInstType instType, String uly, String instId, String ccy) {
            this.channel = channel;
            this.instType = instType;
            this.uly = uly;
            this.instId = instId;
            this.ccy = ccy;
        }
    }
}
