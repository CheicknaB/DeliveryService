import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BarroComponent } from './barro.component';

describe('BarroComponent', () => {
  let component: BarroComponent;
  let fixture: ComponentFixture<BarroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BarroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BarroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
