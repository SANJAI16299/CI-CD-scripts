FROM node:15.4 as build
WORKDIR /app
COPY . .
RUN npm install 
RUN chmod -R a+x node_modules
RUN npm run build
FROM nginx:1.19
COPY --from=build /app/build /usr/share/nginx/html
