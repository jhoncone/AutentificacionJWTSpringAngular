package com.example.clase.util;

import com.example.clase.security.entity.Rol;
import com.example.clase.security.enums.RolNombre;
import com.example.clase.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
    	/*
        Rol rolSupervisor = new Rol(RolNombre.supervisorstaff,5000);
        Rol rolInventory = new Rol(RolNombre.inventorystaff,4000);
        Rol rolSales=new Rol(RolNombre.salesstaff,3000);
        */
    	/*
        Rol rolSupervisor = new Rol(RolNombre.supervisorstaff);
        Rol rolInventory = new Rol(RolNombre.inventorystaff);
        Rol rolSales=new Rol(RolNombre.salesstaff);
        rolService.save(rolSupervisor);
        rolService.save(rolInventory);
        rolService.save(rolSales);
        */
    	/*
        Rol rolSupervisor = new Rol(RolNombre.ROLE_SUPERVISORSTAFF);
        Rol rolInventory = new Rol(RolNombre.ROLE_INVENTORYSTAFF);
        Rol rolSales=new Rol(RolNombre.ROLE_SALESSTAFF);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolSupervisor);
        rolService.save(rolInventory);
        rolService.save(rolSales);
        rolService.save(rolUser);
         */
    }
}
