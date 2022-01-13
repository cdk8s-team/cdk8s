FROM node:17-alpine

WORKDIR /code
COPY package.json /code
RUN npm install

COPY . /code

EXPOSE 3000
CMD ["npm","start"]
