package com.libing;

import org.apache.zookeeper.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author lvlibing
 * @create 2021-06-15 22:59
 */
public class ZookeeperMain {
    public static final String CONNECTION="192.168.45.110:2181,192.168.45.120:2181,192.168.45.119:2181";
    public static ZooKeeper zooKeeper;
    @Before
    public void init () {
        try {
            zooKeeper = new ZooKeeper(CONNECTION, 2000, new Watcher() {
               @Override
               public void process(WatchedEvent watchedEvent) {
                   // 业务逻辑
                   System.out.println("=============start=========");
                   try {
                       List<String> children = null;
                       children = zooKeeper.getChildren("/", true);
                       for (String child : children) {
                           System.out.println(child);
                       }
                       System.out.println("=============end=========");
                   } catch (KeeperException e) {
                       e.printStackTrace();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 1创建节点
    @Test
    public void createNode() throws KeeperException, InterruptedException {
        String s = zooKeeper.create("/libing", "haoxiaozi".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(s);
    }

    @Test
    public void listenMyNode()  {
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
