/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import requests.EstructuraPostPut;

/**
 *
 * @author Windows 8.1
 */
public interface IRequests {
    public Object get(String http);
    public Object filtrar(String http);
}
