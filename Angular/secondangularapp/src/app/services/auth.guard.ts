import { CanActivateFn } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {

  alert('Please login to continue!! ');
  return false;
};
