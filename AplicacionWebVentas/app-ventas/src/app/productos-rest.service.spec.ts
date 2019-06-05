import { TestBed } from '@angular/core/testing';

import { ProductosRestService } from './productos-rest.service';

describe('ProductosRestService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductosRestService = TestBed.get(ProductosRestService);
    expect(service).toBeTruthy();
  });
});
