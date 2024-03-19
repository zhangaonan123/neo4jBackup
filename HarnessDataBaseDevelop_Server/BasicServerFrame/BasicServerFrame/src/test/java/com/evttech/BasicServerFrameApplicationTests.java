package com.evttech;


import com.evttech.dao.CabinRepository;
import com.evttech.pojo.entity.*;
import com.evttech.pojo.relation.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BasicServerFrameApplicationTests {

    @Autowired
    private CabinRepository cabinRepository;


    @Test
    public void test1()
    {
        //创建实体Entity
        Cabin cabin1 = new Cabin();
        Cabin cabin2 = new Cabin();
        Segment seg1 = new Segment();
        Segment seg2 = new Segment();
        Segment seg3 = new Segment();
        Segment seg4 = new Segment();
        Segment seg5 = new Segment();
        CabinLinkNode node = new CabinLinkNode();
        Wire wire1 = new Wire();
        Wire wire2 = new Wire();
        Sign sign1 = new Sign();
        Sign sign2 = new Sign();
        Connector con1 = new Connector();
        Connector con2 = new Connector();
        Connector con3 = new Connector();


        //创建关系Relation
        //Include关系
        IncludeSegmentRe cabin1_seg1 = new IncludeSegmentRe(seg1);
        IncludeSegmentRe cabin1_seg2 = new IncludeSegmentRe(seg2);
        IncludeSegmentRe cabin1_seg3 = new IncludeSegmentRe(seg3);
        IncludeSegmentRe cabin2_seg4 = new IncludeSegmentRe(seg4);
        IncludeSegmentRe cabin2_seg5 = new IncludeSegmentRe(seg5);

        IncludeSignRe wire1_sign1 = new IncludeSignRe(sign1);
        IncludeSignRe wire2_sign2 = new IncludeSignRe(sign2);

        IncludeWireRe seg1_wire1 = new IncludeWireRe(wire1);
        IncludeWireRe seg3_wire1 = new IncludeWireRe(wire1);
        IncludeWireRe seg4_wire1 = new IncludeWireRe(wire1);
        IncludeWireRe seg5_wire1 = new IncludeWireRe(wire1);
        IncludeWireRe seg2_wire2 = new IncludeWireRe(wire2);
        IncludeWireRe seg3_wire2 = new IncludeWireRe(wire2);
        IncludeWireRe seg4_wire2 = new IncludeWireRe(wire2);
        IncludeWireRe seg5_wire2 = new IncludeWireRe(wire2);


        //Link关系
        SegmentLinkRe seg1_seg3 = new SegmentLinkRe(seg3);
        SegmentLinkRe seg2_seg3 = new SegmentLinkRe(seg3);
        SegmentLinkRe seg3_seg2 = new SegmentLinkRe(seg2);
        SegmentLinkRe seg3_seg1 = new SegmentLinkRe(seg1);
        SegmentLinkRe seg4_seg5 = new SegmentLinkRe(seg5);
        SegmentLinkRe seg5_seg4 = new SegmentLinkRe(seg4);

        CabinNodeLinkCabinRe node_cabin1 = new CabinNodeLinkCabinRe(cabin1);
        CabinNodeLinkCabinRe node_cabin2 = new CabinNodeLinkCabinRe(cabin2);

        CabinNodeLinkSegmentRe node_seg3 = new CabinNodeLinkSegmentRe(seg3);
        CabinNodeLinkSegmentRe node_seg4 = new CabinNodeLinkSegmentRe(seg4);

        SegmentLinkNodeRe seg3_node = new SegmentLinkNodeRe(node);
        SegmentLinkNodeRe seg4_node = new SegmentLinkNodeRe(node);

        CabinLinkNodeRe cabin1_node = new CabinLinkNodeRe(node);
        CabinLinkNodeRe cabin2_node = new CabinLinkNodeRe(node);

        SignLinkConnectorRe sign1_con1 = new SignLinkConnectorRe(con1);
        SignLinkConnectorRe sign1_con3 = new SignLinkConnectorRe(con3);
        SignLinkConnectorRe sign2_con3 = new SignLinkConnectorRe(con3);
        SignLinkConnectorRe sign2_con2 = new SignLinkConnectorRe(con2);

        DeliverSignRe con1_sign1 = new DeliverSignRe(sign1);
        DeliverSignRe con3_sign1 = new DeliverSignRe(sign1);
        DeliverSignRe con3_sign2 = new DeliverSignRe(sign2);
        DeliverSignRe con2_sign2 = new DeliverSignRe(sign2);

        //Belong关系
        BelongCabinRe seg1_cabin1 = new BelongCabinRe(cabin1);
        BelongCabinRe seg2_cabin1 = new BelongCabinRe(cabin1);
        BelongCabinRe seg3_cabin1 = new BelongCabinRe(cabin1);
        BelongCabinRe seg4_cabin2 = new BelongCabinRe(cabin2);
        BelongCabinRe seg5_cabin2 = new BelongCabinRe(cabin2);

        //Cross关系
        CrossSegmentRe wire1_seg1 = new CrossSegmentRe(seg1);
        CrossSegmentRe wire1_seg3 = new CrossSegmentRe(seg3);
        CrossSegmentRe wire1_seg4 = new CrossSegmentRe(seg4);
        CrossSegmentRe wire1_seg5 = new CrossSegmentRe(seg5);
        CrossSegmentRe wire2_seg2 = new CrossSegmentRe(seg2);
        CrossSegmentRe wire2_seg3 = new CrossSegmentRe(seg3);
        CrossSegmentRe wire2_seg4 = new CrossSegmentRe(seg4);
        CrossSegmentRe wire2_seg5 = new CrossSegmentRe(seg5);

        CrossWireRe sign1_wire1 = new CrossWireRe(wire1);
        CrossWireRe sign2_wire2 = new CrossWireRe(wire2);

        //添加关系到节点
        cabin1.addLabels();
        cabin1.setName("cabin1");
        cabin1.setHeadLink(null);
        cabin1.setTailLink(cabin1_node);
        cabin1.getIncludesegmentReList().add(cabin1_seg1);
        cabin1.getIncludesegmentReList().add(cabin1_seg2);
        cabin1.getIncludesegmentReList().add(cabin1_seg3);

        cabin2.addLabels();
        cabin2.setName("cabin2");
        cabin2.setHeadLink(cabin2_node);
        cabin2.setTailLink(null);
        cabin2.getIncludesegmentReList().add(cabin2_seg4);
        cabin2.getIncludesegmentReList().add(cabin2_seg5);

        seg1.addLabels();
        seg1.setName("seg1");
        seg1.getTailSegmentLinkList().add(seg1_seg3);
        seg1.setBelongCabinRe(seg1_cabin1);
        seg1.getIncludeWireReList().add(seg1_wire1);

        seg2.addLabels();
        seg2.setName("seg2");
        seg2.getTailSegmentLinkList().add(seg2_seg3);
        seg2.setBelongCabinRe(seg2_cabin1);
        seg2.getIncludeWireReList().add(seg2_wire2);

        seg3.addLabels();
        seg3.setName("seg3");
        seg3.getHeadSegmentLinkList().add(seg3_seg1);
        seg3.getHeadSegmentLinkList().add(seg3_seg2);
        seg3.setTailNodeLink(seg3_node);
        seg3.setBelongCabinRe(seg3_cabin1);
        seg3.getIncludeWireReList().add(seg3_wire1);
        seg3.getIncludeWireReList().add(seg3_wire2);

        seg4.addLabels();
        seg4.setName("seg4");
        seg4.setHeadNodeLink(seg4_node);
        seg4.getTailSegmentLinkList().add(seg4_seg5);
        seg4.setBelongCabinRe(seg4_cabin2);
        seg4.getIncludeWireReList().add(seg4_wire1);
        seg4.getIncludeWireReList().add(seg4_wire2);

        seg5.addLabels();
        seg5.setName("seg5");
        seg5.getHeadSegmentLinkList().add(seg5_seg4);
        seg5.setBelongCabinRe(seg5_cabin2);
        seg5.getIncludeWireReList().add(seg5_wire1);
        seg5.getIncludeWireReList().add(seg5_wire2);

        node.addLabels();
        node.setName("node");
        node.setHeadCabinLink(node_cabin1);
        node.setTailCabinLink(node_cabin2);
        node.setHeadSegmentLink(node_seg3);
        node.setTailSegmentLink(node_seg4);

        wire1.addLabels();
        wire1.setName("wire1");
        wire1.getCrossSegmentReList().add(wire1_seg1);
        wire1.getCrossSegmentReList().add(wire1_seg3);
        wire1.getCrossSegmentReList().add(wire1_seg4);
        wire1.getCrossSegmentReList().add(wire1_seg5);
        wire1.setIncludeSignRe(wire1_sign1);

        wire2.addLabels();
        wire2.setName("wire2");
        wire2.getCrossSegmentReList().add(wire2_seg2);
        wire2.getCrossSegmentReList().add(wire2_seg3);
        wire2.getCrossSegmentReList().add(wire2_seg4);
        wire2.getCrossSegmentReList().add(wire2_seg5);
        wire2.setIncludeSignRe(wire2_sign2);

        sign1.addLabels();
        sign1.setName("sign1");
        sign1.setCrossWireRe(sign1_wire1);
        sign1.setHeadLink(sign1_con1);
        sign1.setTailLink(sign1_con3);

        sign2.addLabels();
        sign2.setName("sign2");
        sign2.setCrossWireRe(sign2_wire2);
        sign2.setHeadLink(sign2_con3);
        sign2.setTailLink(sign2_con2);

        con1.addLabels();
        con1.setName("con1");
        con1.getDeliverSignReList().add(con1_sign1);

        con2.addLabels();
        con2.setName("con2");
        con2.getDeliverSignReList().add(con2_sign2);

        con3.addLabels();
        con3.setName("con3");
        con3.getDeliverSignReList().add(con3_sign1);
        con3.getDeliverSignReList().add(con3_sign2);

        cabinRepository.save(cabin1);

    }



}
