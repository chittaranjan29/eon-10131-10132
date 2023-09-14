import { inject } from '@angular/core';
import { CanActivateFn,Router, } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {

  const router:Router=inject(Router);

  alert('Please login to continue!! ')
  router.navigate(['login']);
  return false;
};
