/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDaoListTransaction;

import java.util.List;

/**
 *
 * @author ´Felipe Chacón
 */
public interface DaoListTransaction<Class> {
    public boolean create(Class obj);
    public Class read(String id);
    public List<Class> readAll();
}
