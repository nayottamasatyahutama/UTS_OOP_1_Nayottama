/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Nayo
 */
public class method {
    private static List<dataMahasiswa> berkas = new LinkedList<dataMahasiswa>();

    public static void addData(dataMahasiswa data) {
        berkas.add(data);
    }

    public static void editData(dataMahasiswa data, int index) {
        berkas.set(index, data);
    }

    public static void removeData(int index) {
        berkas.remove(index);
    }

    public static List<dataMahasiswa> getListData() {
        return berkas;
    }
}
