import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  jobs: any = [];
  
  constructor() { }

  ngOnInit(): void {
    fetch('http://localhost:8080/personas/traer',
    {
        method: 'GET',
        headers: { 'Content-Type': 'application/json' },
    })
    .then((res) => {console.log(res); return res.json()} )
    .then((data) => this.jobs=data)
    

  }

}
