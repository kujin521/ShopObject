package main;


import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * 类：通过hibernate自动创建表
 * 编写人：kujin
 * 创建时间：2020/6/4
 * 修改时间：2020/6/4
 */
public class CreatMyStudent {

    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure();
        SchemaExport export=new SchemaExport(cfg);
        export.create(true,true);
    }
}
