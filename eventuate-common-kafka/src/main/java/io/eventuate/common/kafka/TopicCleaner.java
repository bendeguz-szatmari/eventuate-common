package io.eventuate.common.kafka;

public class TopicCleaner {

  public static String clean(String topic) {
    return topic.replace("$", "_DLR_");
  }

}
