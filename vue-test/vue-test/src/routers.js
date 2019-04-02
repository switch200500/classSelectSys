import HelloWorld from '@/components/HelloWorld'
import Login from '@/components/Login'

const routers = [
    {
        path: '/hello',
        name: 'HelloWorld',
        component: HelloWorld
    },
    {
        path: '/login',
        name: 'Login',
        component: Login
    },

];
export default routers