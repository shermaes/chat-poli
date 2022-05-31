/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poli.clientechat.model.mapper;

import com.poli.clientechat.model.Message;

/**
 * Esta clase es la encargada de hacer las conversiones necesarias en el envío y recepción de mensajes a través de sockets. Sigue el patrón de diseño Mapper.
 * 
 */
public class MessageMapper implements IMessageMapper{
     /***
     * Este método hace una conversión de objeto Message a una cadena de texto para su envío por el canal de salida de un socket.
     * @param message el objeto que contiene las propiedades del mensaje a convertir.
     * @return        una representación en forma de cadena de texto del objeto message.
     */
    @Override
    public String mapMessageToString(Message message) {        
        String stringMessage = String.format("%s: %s", message.getFrom(), message.getContent());
        return stringMessage;
    }
    
}
