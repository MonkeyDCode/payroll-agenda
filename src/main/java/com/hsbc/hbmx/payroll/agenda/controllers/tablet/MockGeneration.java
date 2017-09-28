package com.hsbc.hbmx.payroll.agenda.controllers.tablet;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.hbmx.payroll.agenda.beans.Schedule;

public class MockGeneration {
	
	// 1 - Agendar Visita
	// 2 - Comenzar Visita
	// 3 - Continuar Visita
	// 4 - Ver Informe
	
	public List<Schedule> getCompanyList(){
		List<Schedule> dataList = new ArrayList<Schedule>();
		
		Schedule schedule = new Schedule();
	    schedule.setCompanyName("Caf� Tostado de Exportaci�n S.A. de C.V.");
	    schedule.setNoteCompany("Completada el 31 de Julio del 2017");
	    schedule.setStaVisit(4);
	    schedule.setDescStatus("Completada");
	    schedule.setLink("/link");
	    dataList.add(schedule);

	    schedule = new Schedule();
	    schedule.setCompanyName("Incrementa Consulting S.A. de C.V.");
	    schedule.setNoteCompany("Visita no agendada a�n");
	    schedule.setStaVisit(1);
	    schedule.setDescStatus("No Agendada");
	    schedule.setLink("/link");
	    dataList.add(schedule);
	    
	    schedule = new Schedule();
	    schedule.setCompanyName("Redise�a tu n�mina S.A de C.V.");
	    schedule.setNoteCompany("Visita agendada para el 17 de Octubre");
	    schedule.setStaVisit(2);
	    schedule.setDescStatus("Agendada");
	    schedule.setLink("/link");
	    dataList.add(schedule);
	    
	    schedule = new Schedule();
	    schedule.setCompanyName("Caf� Mexicano S.A. de C.V.");
	    schedule.setNoteCompany("Visita inconclusa, personas pendientes");
	    schedule.setStaVisit(3);
	    schedule.setDescStatus("Pendiente");
	    schedule.setLink("/link");
	    dataList.add(schedule);
	    
	    schedule = new Schedule();
	    schedule.setCompanyName("Empresas Colombianas S.A. de C.V.");
	    schedule.setNoteCompany("Visita inconclusa, personas pendientes");
	    schedule.setStaVisit(3);
	    schedule.setDescStatus("Pendiente");
	    schedule.setLink("/link");
	    dataList.add(schedule);
	    
	    schedule = new Schedule();
	    schedule.setCompanyName("Proceso Manufacturero M�xico S.A. de C.V.");
	    schedule.setNoteCompany("Visita no agendada a�n");
	    schedule.setStaVisit(1);
	    schedule.setDescStatus("No Agendada");
	    schedule.setLink("/link");
	    dataList.add(schedule);
	    
	    schedule = new Schedule();
	    schedule.setCompanyName("Redise�a tu n�mina S.A de C.V.");
	    schedule.setNoteCompany("Visita agendada para el 17 de Octubre");
	    schedule.setStaVisit(2);
	    schedule.setDescStatus("Agendada");
	    schedule.setLink("/link");
	    dataList.add(schedule);
	    
	    return dataList;
	}

}
